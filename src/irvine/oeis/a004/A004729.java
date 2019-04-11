package irvine.oeis.a004;

import irvine.oeis.FiniteSequence;

/**
 * A004729 Divisors of <code>2^32 - 1</code> (for <code>a(1)</code> to <code>a(31),</code> the 31 regular polygons with <code>an</code> odd number of sides constructible with ruler and compass).
 * @author Sean A. Irvine
 */
public class A004729 extends FiniteSequence {

  /** Construct the sequence. */
  public A004729() {
    super(1, 3, 5, 15, 17, 51, 85, 255, 257, 771, 1285, 3855, 4369, 13107, 21845, 65535, 65537, 196611, 327685,
      983055, 1114129, 3342387, 5570645, 16711935, 16843009, 50529027, 84215045, 252645135, 286331153,
      858993459, 1431655765, 4294967295L);
  }
}

