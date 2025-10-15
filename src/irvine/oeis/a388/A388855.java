package irvine.oeis.a388;

import irvine.oeis.a006.A006257;
import irvine.oeis.a062.A062383;

/**
 * A388855 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A388855 extends A388853 {

  /** Construct the sequence. */
  public A388855() {
    super(new A006257().skip(), new A062383().skip());
  }
}

