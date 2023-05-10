package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002144;
import irvine.oeis.a002.A002365;
import irvine.oeis.a002.A002366;

/**
 * A139794 Interleaved reading of catheti and hypotenuses of Gaussian triangles with prime number hypotenuse.
 * <code>a(3n+1)= A002366(n). a(3n+2)=A002365(n). a(3n+3)=A002144(n).</code>
 * @author Georg Fischer
 */
public class A139794 extends Sequence1 {

  private int mN = -1;
  private final Sequence[] mSeqs = {new A002366(), new A002365(), new A002144()};

  @Override
  public Z next() {
    ++mN;
    return mSeqs[mN % 3].next();
  }
}
