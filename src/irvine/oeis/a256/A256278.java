package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256278 <code>a(0)=1, a(1)=2, a(n)=31a(n-1)-29a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A256278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256278() {
    super(new long[] {-29, 31}, new long[] {1, 2});
  }
}
