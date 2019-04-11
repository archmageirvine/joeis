package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132434 <code>a(n) =</code> A132433(n) <code>- 33</code>.
 * @author Sean A. Irvine
 */
public class A132434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132434() {
    super(new long[] {-8, 9}, new long[] {104, 1064});
  }
}
