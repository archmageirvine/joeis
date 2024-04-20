package irvine.oeis.a199;
// manually knest/jaguar at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014105;

/**
 * A199423 Greatest prime factor of n and 2*n+1.
 * @author Georg Fischer
 */
public class A199423 extends Sequence1 {

  private final A014105 mSeq = new A014105();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq.next());
  }
}
