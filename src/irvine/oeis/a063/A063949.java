package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a016.A016825;

/**
 * A063949 Every number is the sum of 4 squares; these are the numbers n for which the first square can be taken to be any positive square &lt; n.
 * @author Sean A. Irvine
 */
public class A063949 extends UnionSequence {

  /** Construct the sequence. */
  public A063949() {
    super(new A016825(), new PrependSequence(new A063951(), 0), new A063951() {
      @Override
      public Z next() {
        return super.next().multiply(4);
      }
    });
  }
}
