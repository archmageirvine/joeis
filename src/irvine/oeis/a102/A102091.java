package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102091 Number of perfect matchings in the <code>C_{2n} X P_3</code> graph <code>(C_{2n}</code> is the cycle graph on <code>2n</code> vertices and <code>P_3</code> is the path graph on <code>3 vertices)</code>.
 * @author Sean A. Irvine
 */
public class A102091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102091() {
    super(new long[] {1, -5, 5}, new long[] {12, 32, 108});
  }
}
