package irvine.oeis.a328;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a025.A025586;

/**
 * A328147 a(n) = A025586(n)/4 for n&gt;=3.
 * @author Georg Fischer
 */
public class A328147 implements Sequence {

  final Sequence mA025586 = new SkipSequence(new A025586(), 2);

  /** Construct the sequence. */
  public A328147() {
  }
  
  @Override
  public Z next() {
    return mA025586.next().divide(Z.FOUR);
  }
}
