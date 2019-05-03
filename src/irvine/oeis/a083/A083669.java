package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083669 Number of ordered quintuples <code>(a,b,c,d,e), -n &lt;=</code> a,b,c,d,e <code>&lt;=</code> n, such that <code>a+b+c+d+e = 0</code>.
 * @author Sean A. Irvine
 */
public class A083669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083669() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 51, 381, 1451, 3951});
  }
}
