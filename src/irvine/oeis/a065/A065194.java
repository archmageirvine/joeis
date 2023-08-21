package irvine.oeis.a065;

import irvine.oeis.Conjectural;
import irvine.oeis.InverseSequence;

/**
 * A065194 Limits of the recursion b(i+1)=B_[i](b(i)), where b(1)=n and B_[k+1](j) = B_[k](j), if j &lt;= k; B_[k+1](j) = B_[k](j) + k, if j &lt; k and (j mod 2k) &gt;= k; B_[k+1](j) = B_[k](j) - k, if j &lt; k and (j mod 2k) &lt; k. Set a(n)=0 if b tends to infinity.
 * @author Sean A. Irvine
 */
public class A065194 extends InverseSequence implements Conjectural {

  /** Construct the sequence. */
  public A065194() {
    super(1, new A065191(), 1);
  }
}
