package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a030.A030208;

/**
 * A152243 Expansion of a(q) * f(-q)^4 where f() is a Ramanujan theta function and a() is a cubic AGM function.
 * @author Georg Fischer
 */
public class A152243 extends Sequence0 {

  private final A030208 mSeq = new A030208();

  @Override
  public Z next() {
    final Z result = mSeq.next();
    mSeq.next();
    mSeq.next();
    return result;
  }
}
