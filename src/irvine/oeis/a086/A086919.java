package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;
import irvine.oeis.a327.A327270;

/**
 * A086919 Smallest number whose absolute value of the successive digit difference is the n-th palindrome, or -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A086919 extends Sequence1 {

  private final DirectSequence mA = new A327270();
  private final Sequence mP = new A002113();

  @Override
  public Z next() {
    return mA.a(mP.next());
  }
}
