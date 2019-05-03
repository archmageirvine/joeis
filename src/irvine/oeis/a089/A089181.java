package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089181 <code>(1,3)</code> entry of powers of the orthogonal design shown in <code>A090592</code>.
 * @author Sean A. Irvine
 */
public class A089181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089181() {
    super(new long[] {-7, 2}, new long[] {1, 2});
  }
}
