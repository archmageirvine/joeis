package irvine.oeis.a391;

import irvine.math.wolfram.ExactWolframBinary;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391977 Maximum final value among the halting 2-state 2-symbol Wolfram machines started with n on the tape.
 * @author Sean A. Irvine
 * @author Gregory Morse
 */
public class A391977 extends Sequence1 {

  private final ExactWolframBinary mMachines = new ExactWolframBinary();
  private long mN;

  @Override
  public Z next() {
    return mMachines.maxima(++mN)[0];
  }
}
