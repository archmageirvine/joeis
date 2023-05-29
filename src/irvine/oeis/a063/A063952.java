package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a016.A016825;

/**
 * A063952 Of course every number is the sum of 4 squares; for these numbers the first square can be taken to be any square &lt; n.
 * @author Sean A. Irvine
 */
public class A063952 extends UnionSequence {

  /** Construct the sequence. */
  public A063952() {
    super(new A016825(), new PrependSequence(new A063954(), 0), new A063954() {
      @Override
      public Z next() {
        return super.next().multiply(4);
      }
    });
  }
}
