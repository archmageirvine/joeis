package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a020.A020730;

/**
 * A014009.
 * @author Sean A. Irvine
 */
public class A014009 extends DifferenceSequence {

  /** Construct the sequence. */
  public A014009() {
    super(new PrependSequence(new A020730(), Z.ZERO));
  }
}

