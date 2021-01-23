package irvine.math.expression;

import irvine.math.api.Ring;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Helper methods for number coercion during expression parsing.
 * @author Sean A. Irvine
 */
final class Coercion {

  private Coercion() { }

  private static final Class<?>[] CLASS_RANK = {
    Z.class,
    Q.class
  };

  private static int rank(final Class<?> c) {
    for (int k = 0; k < CLASS_RANK.length; ++k) {
      if (c == CLASS_RANK[k]) {
        return k;
      }
    }
    return -1;
  }

  static boolean isUpper(final Literal<?, ?> left, final Literal<?, ?> right) {
    final Class<?> l = left.value().getClass();
    final Class<?> r = right.value().getClass();
    return l == r || rank(l) > rank(r);
  }

  @SuppressWarnings("unchecked")
  static <T, R extends Ring<T>> Literal<T, R> force(final Literal<?, ?> lit) {
    return (Literal<T, R>) lit;
  }

}
