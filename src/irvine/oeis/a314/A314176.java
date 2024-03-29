package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314176 Coordination sequence Gal.5.313.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314176 extends TilingSequence {

  /** Construct the sequence. */
  public A314176() {
    super(0, new String[]
        { "4.4.3.3.3;B90+2,A0-2,C0+1,D0+2,A60-5"
        , "4.3.4.3.3;B300+4,A270+1,A330-1,B60+1,E300+4"
        , "4.3.4.3.3;A0+3,C120+3,C240+2,A240-3,D0+3"
        , "3.3.3.3.3.3;A60-4,A0+4,C0+5,A240-4,A180+4,C180+5"
        , "3.3.3.3.3.3;B240+5,B300+5,B0+5,B60+5,B120+5,B180+5"
        });
    defineBaseSet(0);
  }
}
