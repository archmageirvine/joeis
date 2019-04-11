package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016315 Expansion of <code>1/((1-2x)*(1-7x)*(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A016315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016315() {
    super(new long[] {168, -122, 21}, new long[] {1, 21, 319});
  }
}
