package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015977 Two iterations of Reverse and Add are needed to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A015977 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A015977(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A015977() {
    super(0);
  }

  private long mN = 0;

  protected int iterations() {
    return 2;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      Z a = Z.valueOf(++mN);
      for (int k = iterations(); k > 0; --k) {
        a = Functions.REVERSE.z(a).add(a);
        if (Predicates.PALINDROME.is(a)) {
          if (k == 1) {
            return Z.valueOf(mN);
          }
          continue outer;
        }
      }
    }
  }
}
