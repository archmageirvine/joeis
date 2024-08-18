package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A046232 Cubes which are palindromes in base 4.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A046232 extends AbstractSequence {

  private long mN = -1;
  private int mBase;

  /** Construct the sequence. */
  public A046232() {
    this(1, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset
   * @param base
   */
  public A046232(final int offset, final int base) {
    super(offset);
    mBase = base;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).pow(3);
      if (Predicates.PALINDROME.is(mBase, t)) {
        return t;
      }
    }
  }
} 
