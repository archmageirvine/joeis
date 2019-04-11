package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089926 <code>a(n)=12a(n-1)+a(n-2), a(0)=1,a(1)=6</code>.
 * @author Sean A. Irvine
 */
public class A089926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089926() {
    super(new long[] {1, 12}, new long[] {1, 6});
  }
}
