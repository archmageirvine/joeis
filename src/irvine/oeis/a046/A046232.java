package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A046232 Cubes which are palindromes in base 4.
 * @author Sean A. Irvine
 */
public class A046232 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A046232(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A046232() {
    super(1);
  }

  private long mN = -1;

  protected int base() {
    return 4;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).pow(3);
      if (Predicates.PALINDROME.is(base(), t)) {
        return t;
      }
    }
  }
}
