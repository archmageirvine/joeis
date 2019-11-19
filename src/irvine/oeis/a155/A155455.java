package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155455 <code>a(n)=5*a(n-1)+16*a(n-2), n&gt;1 ; a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A155455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155455() {
    super(new long[] {16, 5}, new long[] {0, 1});
  }
}
