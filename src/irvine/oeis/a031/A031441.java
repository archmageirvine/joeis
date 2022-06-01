package irvine.oeis.a031;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A031441 a(0) = 3; for n &gt; 0, a(n) is the greatest prime factor of PreviousPrime(a(n-1))*a(n-1)-1 where PreviousPrime(prime(k))=prime(k-1).
 * @author Sean A. Irvine
 */
public class A031441 extends PrependSequence {

  /** Construct the sequence. */
  public A031441() {
    super(new PeriodicSequence(17, 11, 19, 23, 109), 3, 5, 7);
  }
}
