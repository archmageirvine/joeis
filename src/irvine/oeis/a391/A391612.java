package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391612 Number of ways of n-coloring the square grid graph G_(6,6) such that no rectangle exists with sides parallel to the axes having all 4 corners of the same color.
 * @author Sean A. Irvine
 */
public class A391612 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.pow(3)
      .subtract(225).multiply(n.square())
      .add(1200).multiply(n)
      .add(23400).multiply(n)
      .subtract(17100).multiply(n)
      .subtract(235600).multiply(n)
      .subtract(1172880).multiply(n)
      .add(3554100).multiply(n)
      .add(14950800).multiply(n)
      .add(4788450).multiply(n)
      .subtract(217188900).multiply(n)
      .subtract(147775140).multiply(n)
      .add(1277063490).multiply(n)
      .add(3278280300L).multiply(n)
      .subtract(8195853900L).multiply(n)
      .subtract(20395218060L).multiply(n)
      .add(18424093500L).multiply(n)
      .add(146237008680L).multiply(n)
      .subtract(111172464000L).multiply(n)
      .subtract(444872268900L).multiply(n)
      .add(131937391560L).multiply(n)
      .add(1460325402509L).multiply(n)
      .subtract(603007791420L).multiply(n)
      .subtract(2597863529700L).multiply(n)
      .add(1170515225295L).multiply(n)
      .add(3501236548260L).multiply(n)
      .subtract(2631606698460L).multiply(n)
      .subtract(1337298758460L).multiply(n)
      .add(1305705122400L).multiply(n)
      .add(584585683600L).multiply(n)
      .subtract(830818105680L).multiply(n)
      .add(315465395760L).multiply(n)
      .subtract(53413454880L).multiply(n);
  }
}
