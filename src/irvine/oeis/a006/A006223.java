package irvine.oeis.a006;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A006223 Number of binary rooted trees of height n requiring 3 registers.
 * @author Sean A. Irvine
 */
public class A006223 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A006223() {
    super(new long[] {1}, new long[] {1, -14, 78, -220, 330, -252, 84, -8});
  }
}
