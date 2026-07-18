package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;
import irvine.oeis.a061.A061601;

/**
 * A085927 a(n) is the digitwise absolute difference between the n-th palindrome and its 9's complement.
 * @author Sean A. Irvine
 */
public class A085927 extends Sequence1 {

  private final DirectSequence mNinesComplement = new A061601();
  private final Sequence mPalindromes = new A002113().skip();

  @Override
  public Z next() {
    final Z p = mPalindromes.next();
    final Z n = mNinesComplement.a(p);
    final String ps = p.toString();
    String ns = n.toString();
    while (ns.length() < ps.length()) {
      ns = "0" + ns;
    }
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < ns.length(); ++k) {
      sb.append(Math.abs(ps.charAt(k) - ns.charAt(k)));
    }
    return new Z(sb);
  }
}
