package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019017 Cycle class sequence c(2n) (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite GIS = Cycle class sequences of Gismondine Ca4 [ Al8Si8O32 <code>] </code>. 16 H2O.
 * @author Sean A. Irvine
 */
public class A019017 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // GIS
    return "a-1: a-8(0-0) a-6(+0+) a-4(000) a-2(000)\n"
      + "a-2: a-7(0-0) a-5(-00) a-3(0-0)\n"
      + "a-4: a-7(+0+) a-5(0++)\n"
      + "a-6: a-7(000)\n"
      + "a-3: a-8(-00) a-6(0++) a-4(-00)\n"
      + "a-5: a-8(0-0) a-6(+00)\n"
      + "a-7: a-8(000)\n";
  }
}

