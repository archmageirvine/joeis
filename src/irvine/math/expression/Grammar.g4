/**
 * Grammar. Build with:
 * <pre>
 * antlr4 -o /home/sean/joeis/src/irvine/math/expression -package irvine.math.expression -Dlanguage=Java -no-listener -no-visitor -lib /home/sean/joeis/src/irvine/math/expression /home/sean/joeis/src/irvine/math/expression/Grammar.g4
 * </pre>
 * @author Sean A. Irvine
 */

grammar Grammar;
@parser::header{
package irvine.math.expression;

import irvine.math.z.Z;

/**
 * Parser.
 * @author Sean A. Irvine
 */
}

@lexer::header{
package irvine.math.expression;

import irvine.math.z.Z;

/**
 * Lexer.
 * @author Sean A. Irvine
 */
}

/*
 * Main expression parser. Items listed here in a particular order so that
 * correct precedence rules are applied.
 */

expr returns [Expression v]

  : 'log' '(' a=expr ')'
    {
      $expr.v = new Logarithm($a.v);
    }

  | 'diff' '(' a=expr ',' IDENTIFIER ')'
    {
      $expr.v = new Derivative($a.v, new Identifier($IDENTIFIER.text));
    }

  | 'exp' '(' a=expr ')'
    {
      $expr.v = new Exponential($a.v);
    }

  | 'cosh' '(' a=expr ')'
    {
      $expr.v = new HyperbolicCosine($a.v);
    }

  | 'sinh' '(' a=expr ')'
    {
      $expr.v = new HyperbolicSine($a.v);
    }

  | 'tanh' '(' a=expr ')'
    {
      $expr.v = new HyperbolicTangent($a.v);
    }

  | 'lucas' '(' a=expr ')'
    {
      $expr.v = new Lucas($a.v);
    }

  | 'fibonacci' '(' a=expr ')'
    {
      $expr.v = new Fibonacci($a.v);
    }

  | 'subs' '(' a=expr ',' IDENTIFIER '=' b=expr ')'
    {
      $expr.v = new Substitution($a.v, new Identifier($IDENTIFIER.text), $b.v);
    }

  | 'sum' '(' a=expr ',' IDENTIFIER '=' b=expr '..' c=expr ')'
    {
      $expr.v = new Sum($a.v, new Identifier($IDENTIFIER.text), $b.v, $c.v);
    }

  | '(' a=expr ')'
    {
      $expr.v = $a.v;
    }

  | a=expr '!'
    {
      $expr.v = new Factorial($a.v);
    }

  | a=expr '##'
    {
      $expr.v = new Primorial($a.v, true);
    }

  | a=expr '#'
    {
      $expr.v = new Primorial($a.v);
    }

  | <assoc=right> a=expr '^' b=expr
    {
     $expr.v = new Power($a.v, $b.v);
    }

  | '+' a=expr
    {
      $expr.v = $a.v;
    }

  | '-' a=expr
    {
      $expr.v = new Negate($a.v);
    }

  | a=expr op=('*'|'/'|'%') b=expr
    {
      if ("*".equals($op.text)) {
        $expr.v = Multiply.create($a.v, $b.v);
      } else if ("/".equals($op.text)) {
        $expr.v = Divide.create($a.v, $b.v);
      } else {
      $expr.v = new Modulo($a.v, $b.v);
      }
    }

  | a=expr '-' b=expr
    {
      $expr.v = Subtract.create($a.v, $b.v);
    }

  | a=expr '+' b=expr
    {
      $expr.v = Add.create($a.v, $b.v);
    }

  | INTEGER
    {
      $expr.v = new LiteralZ(new Z($INTEGER.text));
    }

  | IDENTIFIER
    {
      $expr.v = new Identifier($IDENTIFIER.text);
    }
  ;


/** Lexical elements. */
INTEGER         :	[0-9]+ ;
WS              : [ \r\t\n] -> skip ;
IDENTIFIER      : [a-z]+ ;
