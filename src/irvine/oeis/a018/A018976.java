package irvine.oeis.a018;

/**
 * A018976 Cycle class sequence c(2n) (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite ANA = Analcime Na16[ Al16Si32O96 <code>] </code>. 16 H2O.
 * @author Sean A. Irvine
 */
public class A018976 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // ANA
    return "a-1: a-20(000) a-19(000) a-18(000) a-17(00-)\n"
      + "a-2: a-23(00-) a-21(000) a-18(0-0) a-17(0--)\n"
      + "a-3: a-24(000) a-23(-0-) a-22(000) a-21(-00)\n"
      + "a-4: a-24(000) a-22(000) a-20(000) a-19(000)\n"
      + "a-5: a-21(000) a-19(000) a-14(0--) a-13(00-)\n"
      + "a-6: a-23(-00) a-20(--0) a-14(0-0) a-13(000)\n"
      + "a-7: a-24(000) a-17(000) a-16(000) a-13(000)\n"
      + "a-8: a-22(0-0) a-18(--0) a-16(000) a-13(000)\n"
      + "a-9: a-24(000) a-17(000) a-15(-00) a-14(000)\n"
      + "a-10: a-23(000) a-20(0-0) a-16(000) a-15(000)\n"
      + "a-11: a-22(000) a-18(-00) a-15(-0-) a-14(00-)\n"
      + "a-12: a-21(000) a-19(000) a-16(000) a-15(000)\n";
  }
}

