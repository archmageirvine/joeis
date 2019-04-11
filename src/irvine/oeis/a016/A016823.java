package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016823 <code>a(n) = (4n+1)^11</code>.
 * @author Sean A. Irvine
 */
public class A016823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016823() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 48828125, 31381059609L, 1792160394037L, 34271896307633L, 350277500542221L, 2384185791015625L, 12200509765705829L, 50542106513726817L, 177917621779460413L, 550329031716248441L, 1532278301220703125L});
  }
}
