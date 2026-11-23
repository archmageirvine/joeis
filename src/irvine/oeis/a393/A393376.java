package irvine.oeis.a393;

import irvine.math.wolfram.ExactWolframBinary;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393376 Maximum rightmost position among the halting 2-state 2-symbol Wolfram machines started with n on the tape.
 * @author Sean A. Irvine
 * @author Gregory Morse
 */
public class A393376 extends Sequence1 {

  private final ExactWolframBinary mMachines = new ExactWolframBinary();
  private long mN;

  @Override
  public Z next() {
    return mMachines.maxima(++mN)[1];
  }
}
