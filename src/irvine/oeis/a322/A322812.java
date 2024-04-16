package irvine.oeis.a322;
// manually knest/jaguarz at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a048.A048675;

/**
 * A322812 a(n) = A001221(A048675(n)).
 * @author Georg Fischer
 */
public class A322812 extends Sequence2 {

  private final A048675 mSeq = new A048675();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(mSeq.next()));
  }
}
