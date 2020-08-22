package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A003778 Number of Hamiltonian paths in P_5 X P_n.
 * @author Sean A. Irvine
 */
public class A003778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003778() {
    super(new long[]{0, 0, 432, -864, 756, -216, -13032, 28332, 48980, -147856, -187640, 637672, 392241, -1872534,
      -474900, 4121575, 149939, -7358998, 1499560, 9710124, -4382389, -8495755, 5907135, 4554646, -4582138,
      -1288032, 2183660, 46716, -647749, 91896, 116054, -30993, -11333, 4606, 412, -328, 13, 9},
      new Z[] {
        Z.ONE,
        Z.valueOf(22),
        Z.valueOf(132),
        Z.valueOf(1006),
        Z.valueOf(4324),
        Z.valueOf(26996),
        Z.valueOf(109722),
        Z.valueOf(602804),
        Z.valueOf(2434670),
        Z.valueOf(12287118),
        Z.valueOf(49852352),
        Z.valueOf(237425498),
        Z.valueOf(969300694),
        Z.valueOf(4434629912L),
        Z.valueOf(18203944458L),
        Z.valueOf(80978858522L),
        Z.valueOf(333840165288L),
        Z.valueOf(1456084764388L),
        Z.valueOf(6021921661718L),
        Z.valueOf(25904211802080L),
        Z.valueOf(107378816068904L),
        Z.valueOf(457440612631750L),
        Z.valueOf(1899305396852550L),
        Z.valueOf(8036345146341508L),
        new Z("33405640842497978"),
        new Z("140677778437397166"),
        new Z("585243342550350368"),
        new Z("2456482541007655088"),
        new Z("10225087180260916062"),
        new Z("42821044456634131964"),
        new Z("178310739623644629736"),
        new Z("745570951093506967610"),
        new Z("3105442902100584328222"),
        new Z("12970906450154764259728"),
        new Z("54035954199253554652658"),
        new Z("225534416271325317632922"),
        new Z("939676160294548239862008"),
        new Z("3920063808158344161168316"),
      }
    );
  }
}
