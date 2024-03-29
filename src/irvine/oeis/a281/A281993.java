package irvine.oeis.a281;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002235;
import irvine.oeis.a007.A007505;

/**
 * A281993 Integers m such that sigma(m) + sigma(2*m) = 6*m.
 * @author Georg Fischer
 */
public class A281993 extends Sequence1 {

  final Sequence mA002235 = new A002235();
  final Sequence mA007505 = new A007505();
  /** Construct the sequence. */
  public A281993() {
    mA002235.next();
    mA007505.next();
  }
  
  @Override
  public Z next() {
    return Z.TWO.pow(mA002235.next()).multiply(mA007505.next());
  }

}
