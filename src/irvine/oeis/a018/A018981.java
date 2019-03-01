package irvine.oeis.a018;

/**
 * A018981.
 * @author Sean A. Irvine
 */
public class A018981 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AST
    return "a-1: a-9(000) b-8(000) a-5(000) b-4(000)\n"
      + "b-4: a-7(00+) b-6(0+0)\n"
      + "a-5: b-10(0++) a-7(+0+) b-6(++0)\n"
      + "b-8: b-10(00+)\n"
      + "a-9: b-10(0+0)\n"
      + "b-2: a-9(--0) b-8(-0-) b-4(0--) a-3(000)\n"
      + "a-3: b-10(000) a-7(000) b-6(000)\n"
      + "b-6: b-8(-00)\n"
      + "a-7: a-9(-00)\n";
  }
}

