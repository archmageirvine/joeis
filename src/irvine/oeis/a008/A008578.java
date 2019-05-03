package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000040;

/**
 * A008578 Prime numbers at the beginning of the <code>20th</code> century (today 1 is no longer regarded as a prime).
 * @author Sean A. Irvine
 */
public class A008578 extends PrependSequence {

  /** Construct the sequence. */
  public A008578() {
    super(new A000040(), Z.ONE);
  }
}

