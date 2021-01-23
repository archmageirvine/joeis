package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019243 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite TON = Theta-1 Nan[ AlnSi24-nO48 ].
 * @author Sean A. Irvine
 */
public class A019243 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // TON
    return "a-1: a-9(00+) a-9(000) d-4(000) b-2(0-0)\n"
      + "b-2: b-6(0++) b-6(0+0) c-3(000)\n"
      + "d-4: a-11(000) c-7(00+) c-7(000)\n"
      + "a-9: b-10(-00)\n"
      + "c-3: b-12(000) d-8(00+) d-8(000)\n"
      + "b-6: c-7(000)\n"
      + "d-8: a-9(000)\n"
      + "c-7: b-10(000)\n"
      + "a-11: b-12(+00)\n"
      + "a-5: a-11(000) a-11(00-) d-8(000) b-6(0+0)\n"
      + "b-10: b-12(+00) b-12(+0-)\n";
  }
}

