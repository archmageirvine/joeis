package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019018 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite GME = Gmelinite (Na2,Ca)4 [ Al8Si16O48 <code>] . 24</code> H2O.
 * @author Sean A. Irvine
 */
public class A019018 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // GME
    return "a-1: a-20(000) a-19(000) a-16(000) a-7(0--)\n"
      + "a-7: a-23(000) a-15(000) a-13(000)\n"
      + "a-16: a-23(0-0)\n"
      + "a-2: a-24(000) a-22(000) a-17(000) a-12(000)\n"
      + "a-12: a-20(000) a-16(000) a-14(000)\n"
      + "a-17: a-20(00+)\n"
      + "a-3: a-21(000) a-19(000) a-18(000) a-9(+0-)\n"
      + "a-9: a-22(000) a-17(000) a-15(000)\n"
      + "a-18: a-22(+00)\n"
      + "a-4: a-24(000) a-23(000) a-13(000) a-11(0+0)\n"
      + "a-11: a-19(000) a-18(000) a-16(000)\n"
      + "a-13: a-19(0++)\n"
      + "a-5: a-21(000) a-20(000) a-14(000) a-8(00-)\n"
      + "a-8: a-24(000) a-17(000) a-13(000)\n"
      + "a-14: a-24(000)\n"
      + "a-6: a-23(000) a-22(000) a-15(000) a-10(-00)\n"
      + "a-10: a-21(000) a-18(000) a-14(000)\n"
      + "a-15: a-21(-0+)\n";
  }
}

