package irvine.oeis.a062;

import irvine.oeis.RecordSequence;
import irvine.oeis.a060.A060324;

/**
 * A062252 Record-setting values of q(n), the minimal prime q such that n(q+1)-1 is a prime p (i.e., q(n) &gt; q(j) for all 0 &lt; j &lt; n).
 * @author Sean A. Irvine
 */
public class A062252 extends RecordSequence {

  /** Construct the sequence. */
  public A062252() {
    super(new A060324());
  }
}
