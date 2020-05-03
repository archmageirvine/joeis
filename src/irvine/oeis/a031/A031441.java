package irvine.oeis.a031;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A031441 <code>a(0) = 3</code>; for <code>n &gt; 0, a(n)</code> is the greatest prime factor of <code>PreviousPrime(a(n-1))*a(n-1)-1</code> where <code>PreviousPrime(prime(k))=prime(k-1)</code>.
 * @author Sean A. Irvine
 */
public class A031441 extends PrependSequence {

  /** Construct the sequence. */
  public A031441() {
    super(new PeriodicSequence(17, 11, 19, 23, 109), 3, 5, 7);
  }
}
