package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313252 Coordination sequence Gal.5.210.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313252 extends TilingSequence {

  /** Construct the sequence. */
  public A313252() {
    super(0, new String[]
        { "6.4.3.4;A180-1,A60-2,B30+1,C270+3"
        , "4.4.3.3.3;A330+3,B180+2,A210-3,C300-4,C240+4"
        , "4.4.3.3.3;D90+2,C0-2,A90+4,B120+5,C60-5"
        , "4.3.4.3.3;D300+4,C270+1,C330-1,D60+1,E0+3"
        , "3.3.3.3.3.3;D240+5,D300+5,D0+5,D60+5,D120+5,D180+5"
        });
    defineBaseSet(0);
  }
}
