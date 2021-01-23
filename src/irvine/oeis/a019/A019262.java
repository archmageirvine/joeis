package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019262 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite WEI = Weinebeneite Ca4[ Be12P8O32(OH)8 ] . 16 H2O.
 * @author Sean A. Irvine
 */
public class A019262 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // WEI
    return "a-1: a-8(00+) a-4(000) a-3(0-0) b-2(000)\n"
      + "b-2: a-5(000) a-4(000) a-3(000)\n"
      + "a-3: a-6(00+) a-5(000)\n"
      + "a-4: a-10(000) a-5(-00)\n"
      + "a-8: a-10(000)\n"
      + "a-5: a-9(000)\n"
      + "a-6: a-9(000) a-8(0+0) b-7(000)\n"
      + "a-9: a-10(+00)\n"
      + "b-7: a-10(000) a-9(000) a-8(000)\n";
  }
}

