package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A091955.
 * @author Sean A. Irvine
 */
public class A091955 implements Sequence {

  private long mN = 0;
  private String mS = "";

  @Override
  public Z next() {
    mS = mS + ++mN;
    return Z.valueOf(A091956.increasingSequences(mS, Z.ZERO));
  }
}

