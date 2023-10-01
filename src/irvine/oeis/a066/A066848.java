package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066848 Consider sequence of fractions A066657/A066658 produced by ratios of terms in A066720; let m = smallest integer such that all fractions 1/n, 2/n, ..., (n-1)/n have appeared when we reach A066720(m) = k; sequence gives values of k; set a(n) = -1 if some fraction i/n never appears.
 * @author Sean A. Irvine
 */
public class A066848 extends A066849 {

  @Override
  public Z next() {
    return a(super.next().intValueExact() - 1);
  }
}
