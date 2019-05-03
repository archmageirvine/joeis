package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019091 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite CHI = Chiavennite <code>Ca4Mn4 [ Be8Si20O52(OH)8 ] . 8 H2O</code>.
 * @author Sean A. Irvine
 */
public class A019091 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // CHI
    return "a-1: e-26(-00) e-26(--0) e-19(00-) g-7(000)\n"
      + "g-7: f-20(0+-) f-20(00-)\n"
      + "e-19: f-20(000)\n"
      + "e-26: f-27(000)\n"
      + "b-2: d-18(000) f-6(0+0) d-4(00-)\n"
      + "d-4: c-17(000) b-16(000)\n"
      + "f-6: g-21(000) g-21(0-0)\n"
      + "c-3: d-18(000) g-7(000) d-4(00-)\n"
      + "b-16: f-20(0+0) d-18(000)\n"
      + "c-17: g-21(000) d-18(000)\n"
      + "e-5: a-22(000) a-22(0-0) a-15(000) f-6(000)\n"
      + "a-15: g-21(000)\n"
      + "a-22: g-28(000)\n"
      + "a-8: e-26(000) e-19(++0) e-19(+00) g-14(000)\n"
      + "g-14: f-27(000) f-27(0-0)\n"
      + "b-9: d-25(000) f-13(0-0) d-11(000)\n"
      + "d-11: c-24(000) b-23(000)\n"
      + "f-13: g-28(0++) g-28(00+)\n"
      + "c-10: d-25(000) g-14(000) d-11(000)\n"
      + "b-23: f-27(0-0) d-25(00-)\n"
      + "c-24: g-28(000) d-25(00-)\n"
      + "e-12: a-22(00+) a-15(0+0) a-15(000) f-13(000)\n";
  }
}

