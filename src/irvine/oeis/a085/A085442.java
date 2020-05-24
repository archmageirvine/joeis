package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085442 <code>a(n) = Sum_{i=1..n} binomial(i+1,2)^7</code>.
 * @author Sean A. Irvine
 */
public class A085442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085442() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {1, 2188, 282124, 10282124, 181141499, 1982230040, 15475158552L, 93839322648L, 467508775773L, 1989944010148L, 7445104711204L, 25010673566116L, 76686775501847L, 217396817767472L, 575714897767472L, 1436257466526768L});
  }
}
