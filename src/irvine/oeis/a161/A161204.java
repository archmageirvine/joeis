package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161204 <code>a(0)=2</code>. <code>a(n+1) = 2*a(n) +</code> period 4: repeat <code>-5,1,3,1</code>.
 * @author Sean A. Irvine
 */
public class A161204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161204() {
    super(new long[] {2, 1, 1, 1}, new long[] {2, -1, -1, 1});
  }
}
