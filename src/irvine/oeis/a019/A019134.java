package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019134 Cycle class sequence <code>c(n) (the</code> number of true cycles of length n in which a certain node is included) for zeolite HEU = Heulandite <code>Ca4 [ Al8Si28O72 ] . 24 H2O</code>.
 * @author Sean A. Irvine
 */
public class A019134 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // HEU
    return "a-1: e-9(000) b-6(-00) e-5(00-) b-2(0+-)\n"
      + "b-2: d-13(0-0) c-12(000) d-4(00+)\n"
      + "e-5: e-9(000)\n"
      + "b-6: d-17(+00) c-16(000) d-8(00-)\n"
      + "d-4: c-12(000) b-11(0-0) e-5(0-0)\n"
      + "c-12: e-14(000)\n"
      + "d-13: e-14(0+0)\n"
      + "c-3: c-16(000) d-13(000) b-11(000) e-5(000)\n"
      + "b-11: d-13(00-)\n"
      + "c-16: e-18(000)\n"
      + "d-8: c-16(000) b-15(+00) e-9(+00)\n"
      + "d-17: e-18(-00)\n"
      + "c-7: d-17(000) b-15(000) c-12(000) e-9(000)\n"
      + "b-15: d-17(00+)\n"
      + "a-10: e-18(00-) b-15(+0-) e-14(000) b-11(0-0)\n"
      + "e-14: e-18(000)\n";
  }
}

