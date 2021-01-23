package irvine.math.expression;

import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A literal integer.
 * @author Sean A. Irvine
 */
public class LiteralZ extends Literal<Z, Integers> {

  static final LiteralZ LIT_NEG_ONE = new LiteralZ(Z.NEG_ONE);
  static final LiteralZ LIT_ZERO = new LiteralZ(Z.ZERO);
  /** The literal 1. */
  public static final LiteralZ LIT_ONE = new LiteralZ(Z.ONE);
  static final LiteralZ LIT_TWO = new LiteralZ(Z.TWO);

  /**
   * Construct a literal integer.
   * @param value the value of the integer
   */
  public LiteralZ(final Z value) {
    super(value, Integers.SINGLETON);
  }

  /**
   * Construct a literal integer.
   * @param value the value of the integer
   */
  public LiteralZ(final long value) {
    this(Z.valueOf(value));
  }

  @Override
  public Z coerce(final Object obj) {
    if (obj instanceof Z) {
      return (Z) obj;
    }
    if (obj instanceof Boolean) {
      return (Boolean) obj ? Z.ONE : Z.ZERO;
    }
    if (obj instanceof Q) {
      return ((Q) obj).toZ();
    }
    throw new UnsupportedOperationException("Coerce Z to " + obj.getClass());
  }

  @Override
  public int signum() {
    return value().signum();
  }
}
