package irvine.oeis.a060;

import java.io.Serializable;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060143 a(n) = floor(n/tau), where tau = (1 + sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A060143 implements Sequence, Serializable {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).divide(CR.PHI).floor(32);
  }
}

