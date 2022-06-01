package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098179 Expansion of (1-3*x+3*x^2)/(1-5*x+10*x^2-10*x^3+4*x^4).
 * @author Sean A. Irvine
 */
public class A098179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098179() {
    super(new long[] {-4, 10, -10, 5}, new long[] {1, 2, 3, 5});
  }
}
