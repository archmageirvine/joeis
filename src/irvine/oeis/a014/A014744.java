package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014744.
 * @author Sean A. Irvine
 */
public class A014744 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014744() {
    super(Cyclotomic.inverse(735));
  }
}
