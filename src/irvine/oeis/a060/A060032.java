package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060032 Fixed point of the morphism 1 -&gt; 121, 2 -&gt; 122, starting from 1.
 * @author Georg Fischer
 */
public class A060032 extends Sequence0 {

  private String mAn;

  /** Construct the sequence. */
  public A060032() {
    mAn = "1";
  }

  @Override
  public Z next() {
    final Z result = new Z(mAn);
    mAn = mAn.replace("1", "ana").replace("2", "ann");
    mAn = mAn.replace('a', '1').replace('n', '2');
    return result;
  }
}
