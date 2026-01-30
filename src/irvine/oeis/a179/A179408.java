package irvine.oeis.a179;

import java.util.Map;

import irvine.math.z.Z;

/**
 * A179408 Values y corresponding to the records d in A179406.
 * @author Sean A. Irvine
 */
public class A179408 extends A179406 {

  @Override
  protected Z select(final Map.Entry<Z, Long> e) {
    return Z.valueOf(e.getValue()).pow(5).sqrt();
  }
}

